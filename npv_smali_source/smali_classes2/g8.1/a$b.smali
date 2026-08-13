.class public final Lg8/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg8/t$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg8/a;->E(Lg8/t;)Lg8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg8/a$b$a;,
        Lg8/a$b$b;
    }
.end annotation


# instance fields
.field final synthetic a:Lg8/a;

.field final synthetic b:Ljava/util/HashMap;

.field final synthetic c:Lg8/t;

.field final synthetic d:Ljava/util/HashMap;

.field final synthetic e:Ljava/util/HashMap;


# direct methods
.method constructor <init>(Lg8/a;Ljava/util/HashMap;Lg8/t;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 0

    iput-object p1, p0, Lg8/a$b;->a:Lg8/a;

    iput-object p2, p0, Lg8/a$b;->b:Ljava/util/HashMap;

    iput-object p3, p0, Lg8/a$b;->c:Lg8/t;

    iput-object p4, p0, Lg8/a$b;->d:Ljava/util/HashMap;

    iput-object p5, p0, Lg8/a$b;->e:Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ln8/f;Ljava/lang/String;Ljava/lang/Object;)Lg8/t$c;
    .locals 2

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "desc"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg8/w;->b:Lg8/w$a;

    invoke-virtual {p1}, Ln8/f;->g()Ljava/lang/String;

    move-result-object p1

    const-string v1, "asString(...)"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2}, Lg8/w$a;->a(Ljava/lang/String;Ljava/lang/String;)Lg8/w;

    move-result-object p1

    if-eqz p3, :cond_0

    iget-object v0, p0, Lg8/a$b;->a:Lg8/a;

    invoke-virtual {v0, p2, p3}, Lg8/a;->F(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p3, p0, Lg8/a$b;->e:Ljava/util/HashMap;

    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    new-instance p2, Lg8/a$b$b;

    invoke-direct {p2, p0, p1}, Lg8/a$b$b;-><init>(Lg8/a$b;Lg8/w;)V

    return-object p2
.end method

.method public b(Ln8/f;Ljava/lang/String;)Lg8/t$e;
    .locals 3

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "desc"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg8/a$b$a;

    sget-object v1, Lg8/w;->b:Lg8/w$a;

    invoke-virtual {p1}, Ln8/f;->g()Ljava/lang/String;

    move-result-object p1

    const-string v2, "asString(...)"

    invoke-static {p1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, Lg8/w$a;->d(Ljava/lang/String;Ljava/lang/String;)Lg8/w;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lg8/a$b$a;-><init>(Lg8/a$b;Lg8/w;)V

    return-object v0
.end method
