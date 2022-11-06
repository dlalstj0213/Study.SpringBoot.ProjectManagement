# Introduction

개인 프로젝트를 하거나 회사에서 스프링부트 프로젝트를 할때 항상 고민하던 property 관리 방식을 
정리 및 테스트 해보고자 프로젝트를 생성하게 되었다. 따라서 누군가가 이 프로젝트를 본다면 해당 
프로젝트는 정답이 아닌 현재 내가 사용하던 기존 레거시 방식을 보완하고 발전해나가면서 보다 더 효율적인 
스프링부트 프로젝트 관리 방식을 찾아나가는 개인적인 발자취로 생각하면 좋겠다. 

# Branch Description

아래 현재 브랜치들의 사용 목적과 설명을 기재하였댜. 

- `master`
  - 마스터 브랜치로서 가장 최근 보완된 시스템 브랜치와 머지되고 최종 소스코드를 유지하는 브랜치
  - [@Switch :: master](https://github.com/dlalstj0213/Study.SpringBoot.ProjectManagement)

- `legacy-system`
  - 레거시 시스템 브랜치는 기존에 사용하던 프로퍼티 및 빌드 관리 방식을 담고있는 브랜치로서, 
    기존 문제를 파악하고 원인을 분석하여 보완 솔루션을 찾기위한 목적을 갖고 있는 브랜치
  - [@Switch :: legacy-system](https://github.com/dlalstj0213/Study.SpringBoot.ProjectManagement/tree/legacy-system)
  - [@Documents :: legacy-system](https://github.com/dlalstj0213/Study.SpringBoot.ProjectManagement/tree/legacy-system/docs/legacy-system)

- `new-system-{number}.{version}`
  - 신규 시스템 브랜치는 기존 문제를 개선한 브랜치로서, 마스터 브랜치와 최종 머지될 브랜치
  - number : 신규 시스템 타입 번호이다. 레거시 시스템을 개선하기 위한 방식이 여러가지가 있을 것을 대비하여 관리되는 번호이다.
  - version : 각각의 신규 시스템 타입의 버전 업데이트 번호이다.

