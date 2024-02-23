package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/local.properties",
        "classpath:config/${env}.properties"})
public interface ProjectConfig extends Config {

    @DefaultValue("PreProdFirstName")
    String firstName();
    @DefaultValue("PreProdLastName")
    String lastName();
    @DefaultValue("preprod@email.address")
    String emailAddress();
    @DefaultValue("79998887766")
    String phoneNumber();
}
