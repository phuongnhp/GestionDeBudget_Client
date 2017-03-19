package jsf;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author phuong
 */
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

import org.primefaces.model.chart.PieChartModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import service.budget.IBudgetService;
import service.budget.OperationDetail;

@ManagedBean(name = "dataBean")
@SessionScoped
public class DataBean implements Serializable {

    private List<OperationDetail> revenus;
    private List<OperationDetail> depenses;
    private Double totalRevenus;
    private Double totalRevenusPrv;
    private Double totalDepenses;
    private Double totalDepensesPrv;
    private PieChartModel pieModelR;
    private PieChartModel pieModelD;
    private LineChartModel lineModel;
    private Date dateDeb;
    private Date dateFin;

    public LineChartModel getLineModel() {
        lineModel = new LineChartModel();
        LineChartSeries re = new LineChartSeries();
//        re.setFill(true);
        re.setLabel("Revenu");
        Double res = new Double(0);
        String pattern = "yyMMdd";
        re.set("161201", 1000);
        re.set("170101", 1200);
        re.set("170201", 1200);
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        for (OperationDetail op : revenus) {
            re.set(format.format(op.getDateOp()), res += op.getMontant());
            res += op.getMontant();
            //re.set(op.getDateOp().getYear()+1900, res);
        }
        LineChartSeries de = new LineChartSeries();
//        de.setFill(true);
        de.setLabel("Depense");
        de.set("161201", 1000);
        de.set("170101", 1000);
        de.set("170201", 1000);
        Double des = new Double(0);
        for (OperationDetail op : revenus) {
            re.set(format.format(op.getDateOp()), des += op.getMontant());
            des += op.getMontant();
            //re.set(op.getDateOp().getYear()+1900, des);
        }
        lineModel.addSeries(re);
        lineModel.addSeries(de);
        lineModel.setLegendPosition("ne");
        lineModel.setStacked(true);
        lineModel.setShowPointLabels(true);
        lineModel.getAxis(AxisType.X).setLabel("Day");
        Axis yAxis = lineModel.getAxis(AxisType.Y);
        yAxis.setLabel("Euros");
        yAxis.setMin(0); 
//        yAxis.setMax(2000);
        yAxis.setMax(des > res ? des + 10 : res + 10);
        return lineModel;
//        lineModel = new LineChartModel();
//        LineChartSeries boys = new LineChartSeries();
//        boys.setLabel("Boys");
//        boys.set("2004", 120);
//        boys.set("2005", 100);
//        boys.set("2006", 44);
//        boys.set("2007", 150);
//        boys.set("2008", 25);
//        boys.set("2009", 25);
//        LineChartSeries girls = new LineChartSeries();
//        girls.setLabel("Girls");
//        girls.set("2004", 52);
//        girls.set("2005", 60);
//        girls.set("2006", 110);
//        girls.set("2007", 90);
//        girls.set("2008", 120);
//        girls.set("2009", 120);
//        lineModel.addSeries(boys);
//        lineModel.addSeries(girls);
//        lineModel.setTitle("Area Chart");
//        lineModel.setLegendPosition("ne");
//        lineModel.setShowPointLabels(true);
//        lineModel.getAxis(AxisType.X).setLabel("Years");
//        Axis yAxis = lineModel.getAxis(AxisType.Y);
//        yAxis.setLabel("Births");
//        yAxis.setMin(0);
//        yAxis.setMax(300);
//        return lineModel;
    }

    public PieChartModel getPieModelR() {
        Map<String, Number> agents = new HashMap<String, Number>();
        agents.put("Revenus", totalRevenus);
        agents.put("Revenus prévus", totalRevenusPrv);
        pieModelR = new PieChartModel();
        pieModelR.setData(agents);
        pieModelR.setShowDataLabels(true);
        pieModelR.setLegendPosition("e");
        return pieModelR;
    }

    public PieChartModel getPieModelD() {
        Map<String, Number> agents = new HashMap<String, Number>();
        agents.put("Depenses", totalDepenses);
        agents.put("Depenses prévus", totalDepensesPrv);
        pieModelD = new PieChartModel();
        pieModelD.setData(agents);
        pieModelD.setShowDataLabels(true);
        pieModelD.setLegendPosition("e");
        return pieModelD;
    }

    public void init() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        String[] paths = {"applicationContext.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(paths);
        IBudgetService client = (IBudgetService) ctx.getBean("budget");
        revenus = new ArrayList<>();
        List res = client.listerOpts(name, name, 1);
        if (res == null) {
            return;
        }
        totalRevenus = new Double(0);
        totalRevenusPrv = new Double(0);
        for (Object o : res) {
            if (dateDeb == null && dateFin == null) {
                revenus.add((OperationDetail) o);
                totalRevenus += ((OperationDetail) o).getMontant();
                totalRevenusPrv += ((OperationDetail) o).getMontantPrevu();
            } else if (dateDeb == null) {
                if (dateFin != null) {
                    if (((OperationDetail) o).getDateOp().before(dateFin)) {
                        revenus.add((OperationDetail) o);
                        totalRevenus += ((OperationDetail) o).getMontant();
                        totalRevenusPrv += ((OperationDetail) o).getMontantPrevu();
                    }
                }
            } else {
                if (dateFin == null) {
                    if (((OperationDetail) o).getDateOp().after(dateDeb)) {
                        revenus.add((OperationDetail) o);
                        totalRevenus += ((OperationDetail) o).getMontant();
                        totalRevenusPrv += ((OperationDetail) o).getMontantPrevu();
                    }
                } else {
                    if (((OperationDetail) o).getDateOp().after(dateDeb) && ((OperationDetail) o).getDateOp().before(dateFin)) {
                        revenus.add((OperationDetail) o);
                        totalRevenus += ((OperationDetail) o).getMontant();
                        totalRevenusPrv += ((OperationDetail) o).getMontantPrevu();
                    }
                }
            }
        }

        System.out.println(revenus.size());

        depenses = new ArrayList<>();
        res = client.listerOpts(name, name, 0);
        if (res == null) {
            return;
        }
        totalDepenses = new Double(0);
        totalDepensesPrv = new Double(0);
        for (Object o : res) {
            if (dateDeb == null && dateFin == null) {
                depenses.add((OperationDetail) o);
                totalDepenses += ((OperationDetail) o).getMontant();
                totalDepensesPrv += ((OperationDetail) o).getMontantPrevu();
            } else if (dateDeb == null) {
                if (dateFin != null) {
                    if (((OperationDetail) o).getDateOp().before(dateFin)) {
                        depenses.add((OperationDetail) o);
                        totalDepenses += ((OperationDetail) o).getMontant();
                        totalDepensesPrv += ((OperationDetail) o).getMontantPrevu();
                    }
                }
            } else {
                if (dateFin == null) {
                    if (((OperationDetail) o).getDateOp().after(dateDeb)) {
                        depenses.add((OperationDetail) o);
                        totalDepenses += ((OperationDetail) o).getMontant();
                        totalDepensesPrv += ((OperationDetail) o).getMontantPrevu();
                    }
                } else {
                    if (((OperationDetail) o).getDateOp().after(dateDeb) && ((OperationDetail) o).getDateOp().before(dateFin)) {
                        depenses.add((OperationDetail) o);
                        totalDepenses += ((OperationDetail) o).getMontant();
                        totalDepensesPrv += ((OperationDetail) o).getMontantPrevu();
                    }
                }
            }
        }
    }

    public String modifier(int id) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        OprationBean operationBean = (OprationBean) facesContext.getApplication()
                .getVariableResolver().resolveVariable(facesContext, "operationBean");
        operationBean.setId(id);
        return "operationMod";
    }

    public String creer() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        OprationBean operationBean = (OprationBean) facesContext.getApplication()
                .getVariableResolver().resolveVariable(facesContext, "operationBean");
        operationBean.setId(null);
        return "operationCre";
    }

    public void filtrer() {
        init(); 
        //return "";
    }

    public List<OperationDetail> getRevenus() {
        return revenus;
    }

    public List<OperationDetail> getDepenses() {
        return depenses;
    }

    public Date getDateDeb() {
        return dateDeb;
    }

    public void setDateDeb(Date dateDeb) {
        this.dateDeb = dateDeb;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Double getTotalRevenus() {
        return totalRevenus;
    }

    public Double getTotalRevenusPrv() {
        return totalRevenusPrv;
    }

    public Double getTotalDepenses() {
        return totalDepenses;
    }

    public Double getTotalDepensesPrv() {
        return totalDepensesPrv;
    }

    public Double getTotalRestant() {
        return totalRevenus - totalDepenses;
    }

}
