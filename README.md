# Firmareal
A lab for e-Signature 

## Technology Stack
- [Java 8](docs/java-language.md)
- Spring
- Hibernate
- Tomcat
- Rest API
- Apache Maven or Apache Ant
- Git 

## Software Engineering

### Design Patterns
- Singleton
- Delegation Even Model
- Builder
- Factory Method
- Dependency Injection 

## Getting Started

### Required third-pary applications
1. FreeOffice/LibreOffice
   <p> Used for converting ms office documents into pdf files </p>
   
   <details>
     <summary>Usage</summary>
     
     Converts the excel file my-doc.xls to a pdf file
      
      ```bash
        soffice --headless --convert-to pdf my-doc.xls
      ```
   
      #### Links
      
      [Using libreoffice to convert .docx to pdf](https://ask.libreoffice.org/t/use-soffice-to-convert-from-docx-pdf-deterministically/34418)
      
      [Converting docs to pdf - troubleshoting](https://localcoder.org/command-libreoffice-headless-convert-to-pdf-test-docx-outdir-pdf-is-not)
   </details>
   
2. ImageMagick
   <p>Used for converting pdf files into image file (.png) </p>

### Windows Development Environment Applications

  [Postgresql 12.11](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads)
  
### Git Work Flow
Git is the main code repository for the project, 
follow the below instructions in order to add code to the repo. 

#### Adding code to the repo
Let's create a feature branch for the Github issue 4 assigned to the developer misha     

1. A Github issue ticket was assigned to the developer misha. Look up for the issue number ( 4 for our case)

2. Create a new feature branch from the develop branch 
     
    ```bash
       $ git checkout develop 
       $ git pull 
       $ git checkout -b feature/misha/issue-4 
    ```    

3. Make the code changes locally, test the app and make sure everything works fine

4. Save your changes

    ```bash
       $ git add .git  
       $ git commit -m "A comment that describes the changes" 
    ```   
5. Push changes to the remote repository 

    ```bash
       $ git push -u origin feature/misha/issue-4 
    ``` 
6. Create a Pull Request against the develop branch in GitHub 
      <details> 
      <summary>How to Create a Pull Request in GitHub</summary>    
   
      [Step 1](docs/git/gitbub-pullrequest-step1.png)

      [Step 2](docs/git/github-pullrequest-step2.png)

      [Step 3](docs/git/github-pullrequest-step3.png)
 
   </details>

#### Creating a Release branch
1. Checkout the latest develop branch
   ```bash
   $ git checkout develop
   $ git pull
   $ git pull --tags
   ```
2. Create the branch release/v0.0.3
   ```bash 
      $ git branch -b release/v0.0.3
   ```

3. Push the just created branch to the remote repo.
   ```bash
      $ git push -u origin release/v0.0.03 
   ```
4. QA will deploy the release/v0.0.3 branch to test,stage or qa and make the last test
   If everything is ok then Merge back to master


### Links
[A markdown cheat-sheet](https://towardsdatascience.com/the-ultimate-markdown-cheat-sheet-3d3976b31a0)

### Release Notes

- [Release 0.0.1 ](docs/release-notes/releasenotes-0.0.1.md)
- [Release 0.0.2 ](docs/release-notes/releasenotes-0.0.2.md)
- [Release 0.0.3 ](docs/release-notes/releasenotes-0.0.3.md)
