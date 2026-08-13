.class public abstract Lha/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfa/d;
.implements Ljava/io/Serializable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private i(Lga/b;Lfa/g;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lha/a;->h(Lga/b;Lfa/g;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public synthetic d(Lga/b;)Z
    .locals 0

    invoke-static {p0, p1}, Lfa/c;->a(Lfa/d;Lga/b;)Z

    move-result p1

    return p1
.end method

.method public g(Ljava/lang/String;)V
    .locals 2

    .prologue
    invoke-interface {p0}, Lfa/d;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lga/b;->I:Lga/b;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, v1}, Lha/a;->i(Lga/b;Lfa/g;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method protected abstract h(Lga/b;Lfa/g;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
.end method
