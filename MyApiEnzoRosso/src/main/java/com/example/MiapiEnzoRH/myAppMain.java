package com.example.MiapiEnzoRH;

import com.example.MiapiEnzoRH.entities.*;
import com.example.MiapiEnzoRH.entities.enums.*;
import com.example.MiapiEnzoRH.repositories.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class myAppMain {
    @Autowired
    private ImageRepository imageRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private ProvinceRepository provinceRepository;
    @Autowired
    private AreaRepository areaRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private BranchRepository branchRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderDetailsRepository orderDetailsRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private PromotionRepository promotionRepository;
    @Autowired
    private MeasurementUnitRepository measurementUnitRepository;
    @Autowired
    private ManofacturedArticleRepository manofacturedArticleRepository;
    @Autowired
    private ManofacturedArticleDetailsRepository manofacturedArticleDetailsRepository;
    @Autowired
    private PromotionsDetailsRepository promotionsDetailsRepository;
    @Autowired
    private SupplyItemRepository supplyItemRepository;
    @Autowired
    private BillRepository billRepository;

    public static void main(String[] args) {
        SpringApplication.run(myAppMain.class, args);
        System.out.println("Server ON");
    }

    @Bean
    @Transactional
    CommandLineRunner init(ImageRepository imageRepository,
                           UserRepository userRepository,
                           EmployeeRepository employeeRepository,
                           ClientRepository clientRepository,
                           CountryRepository countryRepository,
                           ProvinceRepository provinceRepository,
                           AreaRepository areaRepository,
                           AddressRepository addressRepository,
                           CompanyRepository companyRepository,
                           BranchRepository branchRepository,
                           OrderRepository orderRepository,
                           OrderDetailsRepository orderDetailsRepository,
                           CategoryRepository categoryRepository,
                           PromotionRepository promotionRepository,
                           MeasurementUnitRepository measurementUnitRepository,
                           SupplyItemRepository supplyItemRepository,
                           ManofacturedArticleRepository manofacturedArticleRepository,
                           ManofacturedArticleDetailsRepository manofacturedArticleDetailsRepository,
                           PromotionsDetailsRepository promotionsDetailsRepository,
                           BillRepository billRepository){
        return args -> {

            Country country1 = Country.builder()
                    .name("Country 1")
                    .build();
            countryRepository.save(country1);

            Province province1 = Province.builder()
                    .name("Province 1")
                    .country(country1)
                    .build();
            provinceRepository.save(province1);

            Area area1 = Area.builder()
                    .name("Localidad 1")
                    .province(province1)
                    .build();
            areaRepository.save(area1);

            Address address1 = Address.builder()
                    .street("Street 1")
                    .number(1234)
                    .pc(1234)
                    .area(area1)
                    .build();
            addressRepository.save(address1);

            Address address2 = Address.builder()
                    .street("Street 2")
                    .number(5678)
                    .pc(5678)
                    .area(area1)
                    .build();
            addressRepository.save(address2);

            Company company1 = Company.builder()
                    .businessName("Company ACME")
                    .name("Company 1")
                    .lin(12334555)
                    .build();
            companyRepository.save(company1);

            Branch br1 = Branch.builder()
                    .name("Branch 1")
                    .headquarters(Boolean.FALSE)
                    .address(address1)
                    .openingHours(LocalTime.of(8,30))
                    .closingHours(LocalTime.of(20,30))
                    .company(company1)
                    .build();
            //branchRepository.save(br1);

            Image img1 = Image.builder()
                    .denomination("Imange 1")
                    .build();
            imageRepository.save(img1);
            Image img2 = Image.builder()
                    .denomination("Imangen 2")
                    .build();
            imageRepository.save(img2);

            User us1 = User.builder()
                    .authoID("pass")
                    .userName("user")
                    .build();
            userRepository.save(us1);

            User us2 = User.builder()
                    .authoID("pass2")
                    .userName("user2")
                    .build();
            userRepository.save(us2);

            Employee em1 = Employee.builder()
                    .branch(br1)
                    .build();
            em1.setName("Enzo");
            em1.setSurname("Rosso");
            em1.setPhoneNumber("4233899");
            em1.setEmail("unoeno@gmail.com");
            em1.setBirthday(LocalDate.of(1995,10,31));
            em1.setPersonImage(img1);
            em1.setUser(us1);
            em1.setRol(Rol.CASHIER);
            employeeRepository.save(em1);

            Client cli1 = Client.builder().build();
            cli1.setName("Ana");
            cli1.setSurname("Cortina");
            cli1.setPhoneNumber("453389");
            cli1.setEmail("tester@gmail.com");
            cli1.setBirthday(LocalDate.of(1996,1,25));
            cli1.setPersonImage(img2);
            cli1.setUser(us2);
            cli1.setRol(Rol.CLIENT);
            cli1.getAddresses().add(address1);
            cli1.getAddresses().add(address2);
            clientRepository.save(cli1);

            Order ord1 = Order.builder()
                    .orderDate(LocalDate.of(2023,5,23))
                    .branch(br1).client(cli1)
                    .employee(em1).total(250.5)
                    .state(State.PENDING)
                    .paymentMethod(PaymentMethod.CASH)
                    .estimatedCompletionTime(LocalTime.of(12,55))
                    .shippingType(ShippingType.DELIVERY)
                    .totalCost(170.0)
                    .build();
            orderRepository.save(ord1);

            OrderDetails orderD1 = OrderDetails.builder()
                    .order(ord1)
                    .quantity(5)
                    .subTotal(450.5)
                    .build();
            orderDetailsRepository.save(orderD1);

            OrderDetails orderD2 = OrderDetails.builder()
                    .order(ord1)
                    .quantity(2)
                    .subTotal(300.0)
                    .build();
            orderDetailsRepository.save(orderD2);

            Category cat1 = Category.builder()
                    .designation("Category 1")
                    .build();
            categoryRepository.save(cat1);

            Category subCat1 = Category.builder()
                    .designation("Subcategory 1")
                    .fatherCategory(cat1)
                    .build();
            categoryRepository.save(subCat1);

            Category subCat2 = Category.builder()
                    .designation("Subcategory 2")
                    .fatherCategory(cat1)
                    .build();
            categoryRepository.save(subCat2);

            cat1.getSubcategory().add(subCat1);
            cat1.getSubcategory().add(subCat2);
            categoryRepository.save(cat1);

            br1.getCategories().add(cat1);
            //branchRepository.save(br1);

            Image imgProm1 = Image.builder()
                    .denomination("Image promotiom 1")
                    .build();
            imageRepository.save(imgProm1);
            Image imgProm2 = Image.builder()
                    .denomination("Image promotion 2")
                    .build();
            imageRepository.save(imgProm2);

            Promotion prom1 = Promotion.builder()
                    .designation("Promotion 1")
                    .discountDescription("10% off")
                    .startTime(LocalDate.of(2024,6,12))
                    .endTime(LocalDate.of(2024, 6, 25))
                    .startHour(LocalTime.of(20,30))
                    .endHour(LocalTime.of(23,30))
                    .promotionPrice(2500.5)
                    .promotionType(PromotionType.HAPPYHOUR)
                    .build();
            prom1.getPromotionImages().add(imgProm1);
            promotionRepository.save(prom1);

            Promotion prom2 = Promotion.builder()
                    .designation("Promotion 2")
                    .discountDescription("15% off")
                    .startTime(LocalDate.of(2024,6,12))
                    .endTime(LocalDate.of(2024, 6, 25))
                    .startHour(LocalTime.of(11,30))
                    .endHour(LocalTime.of(14,30))
                    .promotionPrice(3000.0)
                    .promotionType(PromotionType.HAPPYHOUR)
                    .build();
            prom2.getPromotionImages().add(imgProm2);
            promotionRepository.save(prom2);

            br1.getPromotions().add(prom1);
            br1.getPromotions().add(prom2);
            branchRepository.save(br1);

            MeasurementUnit unit = MeasurementUnit.builder()
                    .designation("Unit: 1")
                    .build();
            measurementUnitRepository.save(unit);

            SupplyItem supply1 = SupplyItem.builder()
                    .designation("Supply Item: 1")
                    .sellingPrice(230.0)
                    .buyPrice(460.5)
                    .anualStock(36)
                    .maxStock(150)
                    .itsForMaking(Boolean.TRUE)
                    .category(cat1)
                    .measurementUnit(unit)
                    .build();
            supply1.getArticleImges().add(img1);
            supplyItemRepository.save(supply1);

            ManofacturedArticle artManuf1 = ManofacturedArticle.builder()
                    .designation("Manofactured Article 1")
                    .category(cat1)
                    .sellingPrice(140.5)
                    .description("Description art manuf 1")
                    .estimatedMinutes(60)
                    .preparation("Preparation art manuf 1")
                    .measurementUnit(unit)
                    .build();
            artManuf1.getArticleImges().add(img2);
            manofacturedArticleRepository.save(artManuf1);

            ManofacturedArticleDetails artManufDet1 = ManofacturedArticleDetails.builder()
                    .quantity(2)
                    .supplyItem(supply1)
                    .manofacturedArticle(artManuf1)
                    .build();
            manofacturedArticleDetailsRepository.save(artManufDet1);

            PromotionDetails promDetalle1 = PromotionDetails.builder()
                    .quantity(2)
                    .article(artManuf1)
                    .promotion(prom1)
                    .build();
            promotionsDetailsRepository.save(promDetalle1);

            Bill bill1 = Bill.builder()
                    .order(ord1)
                    .paymentMethod(PaymentMethod.CASH)
                    .billingDate(LocalDate.of(2024,6,10))
                    .totalSale(ord1.getTotal())
                    .build();
            billRepository.save(bill1);

        };
    }

}
