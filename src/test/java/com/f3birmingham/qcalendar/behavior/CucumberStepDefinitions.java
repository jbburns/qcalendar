package com.f3birmingham.qcalendar.behavior;


import com.f3birmingham.qcalendar.database.tables.pojos.Pax;
import com.f3birmingham.qcalendar.database.tables.pojos.Region;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class CucumberStepDefinitions {

    @Autowired
    private HttpClient bagHttpClient;

    private AtomicInteger regionIncrementer = new AtomicInteger(0);
    private AtomicInteger paxIncrementer = new AtomicInteger(0);

    @Then("^the api should return (\\w+)$")
    public void the_api_should_return(final String something){
        assertThat(something).isEqualTo("world");
    }

    @DataTableType
    public Region regionEntry(Map<String,String> entry) {
        return new Region()
                .setId(Integer.valueOf(entry.getOrDefault("id", regionIncrementer.toString())))
                .setName(entry.get("name"))
                .setWebsite(entry.get("website"));
    }

    @DataTableType
    public Pax paxEntry(Map<String,String> entry) {
        return new Pax()
                .setId(Integer.valueOf(entry.getOrDefault("id", paxIncrementer.toString()) ))
                .setRegionId(Integer.valueOf(entry.get("region")))
                .setF3Name(entry.get("f3name"))
                .setRealName(entry.get("realName"))
                .setEmail(entry.get("email"))
                .setSlackHandle(entry.get("slackHandle"))
                .setLinkedin(entry.get("linkedIn"))
                .setPhone(entry.get("phone"))
                .setBirthday(LocalDate.parse(entry.get("birthday")))
                .setVq(LocalDate.parse(entry.get("vq")))
                .setEnablePostTracking(Boolean.getBoolean(entry.getOrDefault("postTracking","false")));
    }


    @Given("We have the following region details")
    public void we_have_the_following_region_details(List<Region> regions) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        log.info(regions.toString());
    }

    @Given("We have the following pax details")
    public void we_have_the_following_pax_details(List<Pax> pax) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        log.info(pax.toString());
    }

    @Given("The following pax information")
    public void the_following_pax_information(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
    @When("We create the pax")
    public void we_create_the_pax() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("We ask for the pax's profile")
    public void we_ask_for_the_pax_s_profile() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("We should get")
    public void we_should_get() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




}

