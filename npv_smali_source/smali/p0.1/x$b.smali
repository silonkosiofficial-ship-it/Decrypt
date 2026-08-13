.class final Lp0/x$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp0/x;-><init>(Ljava/lang/String;[FLp0/z;[FLp0/j;Lp0/j;FFLp0/y;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lp0/x;


# direct methods
.method constructor <init>(Lp0/x;)V
    .locals 0

    iput-object p1, p0, Lp0/x$b;->D:Lp0/x;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(D)Ljava/lang/Double;
    .locals 8

    iget-object v0, p0, Lp0/x$b;->D:Lp0/x;

    invoke-virtual {v0}, Lp0/x;->F()Lp0/j;

    move-result-object v0

    iget-object v1, p0, Lp0/x$b;->D:Lp0/x;

    invoke-static {v1}, Lp0/x;->B(Lp0/x;)F

    move-result v1

    float-to-double v4, v1

    iget-object v1, p0, Lp0/x$b;->D:Lp0/x;

    invoke-static {v1}, Lp0/x;->A(Lp0/x;)F

    move-result v1

    float-to-double v6, v1

    move-wide v2, p1

    invoke-static/range {v2 .. v7}, LE7/j;->i(DDD)D

    move-result-wide p1

    invoke-interface {v0, p1, p2}, Lp0/j;->a(D)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lp0/x$b;->a(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method
