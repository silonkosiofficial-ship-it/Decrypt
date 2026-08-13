.class public final LP7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP7/g;


# instance fields
.field private final C:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    const-string v0, "annotations"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP7/h;->C:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public H(Ln8/c;)Z
    .locals 0

    invoke-static {p0, p1}, LP7/g$b;->b(LP7/g;Ln8/c;)Z

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, LP7/h;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, LP7/h;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public j(Ln8/c;)LP7/c;
    .locals 0

    invoke-static {p0, p1}, LP7/g$b;->a(LP7/g;Ln8/c;)LP7/c;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LP7/h;->C:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
