# Some essential links
- Kabana: https://www.elastic.co/kibana
- Kabana docker: https://www.elastic.co/guide/en/kibana/current/docker.html


# Installation:
Docker commands: 
- To run elasticsearch 
```
docker run -p 9200:9200 -p 9300:9300 --name elasticsearch -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:7.11.1
```

- To run Kibana
```
 docker run -p 5601:5601 --name kibana --link elasticsearch:elasticsearch docker.elastic.co/kibana/kibana:7.11.1
 ```
![alt text](image.png)

Access to Kibana: http://localhost:5601/app/home#/

- Kibana authetication with SSO: https://www.elastic.co/guide/en/kibana/current/kibana-authentication.html
- Kabana installation: https://www.elastic.co/guide/en/elasticsearch/reference/7.11/docker.html