.class final Lo0/m0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo0/m0;->f(LD0/M;LD0/G;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/X;

.field final synthetic E:Lo0/m0;


# direct methods
.method constructor <init>(LD0/X;Lo0/m0;)V
    .locals 0

    iput-object p1, p0, Lo0/m0$a;->D:LD0/X;

    iput-object p2, p0, Lo0/m0$a;->E:Lo0/m0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 8

    iget-object v1, p0, Lo0/m0$a;->D:LD0/X;

    iget-object v0, p0, Lo0/m0$a;->E:Lo0/m0;

    invoke-virtual {v0}, Lo0/m0;->T1()Lx7/l;

    move-result-object v5

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v7}, LD0/X$a;->v(LD0/X$a;LD0/X;IIFLx7/l;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, Lo0/m0$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
