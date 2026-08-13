.class final LP7/k$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP7/k;->j(Ln8/c;)LP7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ln8/c;


# direct methods
.method constructor <init>(Ln8/c;)V
    .locals 0

    iput-object p1, p0, LP7/k$a;->D:Ln8/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LP7/g;)LP7/c;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP7/k$a;->D:Ln8/c;

    invoke-interface {p1, v0}, LP7/g;->j(Ln8/c;)LP7/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LP7/g;

    invoke-virtual {p0, p1}, LP7/k$a;->a(LP7/g;)LP7/c;

    move-result-object p1

    return-object p1
.end method
