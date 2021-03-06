package me.chanjar.kafka.stream.daily_usage;

import me.chanjar.kafka.stream.util.AbstractStreamsFactory;
import me.chanjar.kafka.stream.util.SimpleStreamsConfigurationConfigurer;
import me.chanjar.kafka.stream.util.TopologyFactory;
import org.apache.kafka.streams.StreamsConfig;

import java.util.HashMap;
import java.util.Map;

public class MeterDailyUsageStreamsFactory extends AbstractStreamsFactory {

  public MeterDailyUsageStreamsFactory(TopologyFactory topologyFactory) {

    super(topologyFactory);

    Map<String, Object> config = new HashMap<>();
    config.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG, "exactly_once");
    addStreamsConfigurationConfigurer(new SimpleStreamsConfigurationConfigurer(config));
  }

}
