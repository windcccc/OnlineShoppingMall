package com.aden.os.biz;

import com.aden.os.entity.OrderProcessingRecord;

import java.util.List;

public interface OrderProcessingRecordBiz {

    void addPayRecord(OrderProcessingRecord orderProcessingRecord);

    void addDeliverRecord(OrderProcessingRecord orderProcessingRecord);

    List<OrderProcessingRecord> getOrderProcessingRecord(Integer orderId);
}
