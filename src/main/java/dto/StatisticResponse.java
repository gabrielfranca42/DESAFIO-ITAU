package dto;

import lombok.Getter;

import java.util.DoubleSummaryStatistics;


@Getter
public class StatisticResponse {
    private long count;
    private double sum;
    private double avg;
    private double min;
    private double max;

    public StatisticResponse(DoubleSummaryStatistics stats){
        this.count = stats.getCount();
        this.sum = stats.getSum();
        this.avg = stats.getAverage();
        this.min = stats.getMin();
        this.max = stats.getMax();

    }



}

