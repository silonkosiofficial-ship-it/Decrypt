.class public Lg8/a$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg8/t$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field private final a:Lg8/w;

.field private final b:Ljava/util/ArrayList;

.field final synthetic c:Lg8/a$b;


# direct methods
.method public constructor <init>(Lg8/a$b;Lg8/w;)V
    .locals 1

    const-string v0, "signature"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lg8/a$b$b;->c:Lg8/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lg8/a$b$b;->a:Lg8/w;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lg8/a$b$b;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    iget-object v0, p0, Lg8/a$b$b;->b:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg8/a$b$b;->c:Lg8/a$b;

    iget-object v0, v0, Lg8/a$b;->b:Ljava/util/HashMap;

    iget-object v1, p0, Lg8/a$b$b;->a:Lg8/w;

    iget-object v2, p0, Lg8/a$b$b;->b:Ljava/util/ArrayList;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public c(Ln8/b;LO7/a0;)Lg8/t$a;
    .locals 2

    const-string v0, "classId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg8/a$b$b;->c:Lg8/a$b;

    iget-object v0, v0, Lg8/a$b;->a:Lg8/a;

    iget-object v1, p0, Lg8/a$b$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2, v1}, Lg8/b;->y(Ln8/b;LO7/a0;Ljava/util/List;)Lg8/t$a;

    move-result-object p1

    return-object p1
.end method

.method protected final d()Lg8/w;
    .locals 1

    iget-object v0, p0, Lg8/a$b$b;->a:Lg8/w;

    return-object v0
.end method
