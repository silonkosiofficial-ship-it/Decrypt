.class LL7/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL7/g;-><init>(LE8/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:LL7/g;


# direct methods
.method constructor <init>(LL7/g;)V
    .locals 0

    iput-object p1, p0, LL7/g$b;->C:LL7/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LL7/g$e;
    .locals 10

    .prologue
    new-instance v0, Ljava/util/EnumMap;

    const-class v1, LL7/h;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, LL7/h;->values()[LL7/h;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    aget-object v6, v3, v5

    iget-object v7, p0, LL7/g$b;->C:LL7/g;

    invoke-virtual {v6}, LL7/h;->n()Ln8/f;

    move-result-object v8

    invoke-virtual {v8}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, LL7/g;->b(LL7/g;Ljava/lang/String;)LF8/M;

    move-result-object v7

    iget-object v8, p0, LL7/g$b;->C:LL7/g;

    invoke-virtual {v6}, LL7/h;->i()Ln8/f;

    move-result-object v9

    invoke-virtual {v9}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, LL7/g;->b(LL7/g;Ljava/lang/String;)LF8/M;

    move-result-object v8

    invoke-interface {v0, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    new-instance v3, LL7/g$e;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v2, v4}, LL7/g$e;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;LL7/g$a;)V

    return-object v3
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LL7/g$b;->a()LL7/g$e;

    move-result-object v0

    return-object v0
.end method
