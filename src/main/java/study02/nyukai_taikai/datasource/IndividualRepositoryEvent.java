package study02.nyukai_taikai.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import study02.nyukai_taikai.domain.individual.IndividualApplication;
import study02.nyukai_taikai.domain.individual.IndividualRepository;
import study02.nyukai_taikai.domain.member.MemberId;

@Repository
public class IndividualRepositoryEvent implements IndividualRepository {

    @Autowired
    private IndividualMapper individualMapper;

    public MemberId find(IndividualApplication individualApplication) {
        return individualMapper.select(
                individualApplication.getName().getValue(),
                individualApplication.getNameKana().getValue()
        );
    }

    public void save(MemberId memberId, IndividualApplication individualApplication) {

        individualMapper.insert(
                memberId.getValue(),
                individualApplication.getName().getValue(),
                individualApplication.getNameKana().getValue(),
                individualApplication.getGender().getValue(),
                individualApplication.getBirthday().getStringValue(),
                individualApplication.getPostalCode().getValue(),
                individualApplication.getStreetAddress().getValue(),
                individualApplication.getPhoneNumber().getValue(),
                individualApplication.getContactAddress().getValue()
        );
    }
}
