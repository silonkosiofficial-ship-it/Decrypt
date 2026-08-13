.class public final LV/k0;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field final synthetic D:Lx7/l;


# direct methods
.method public constructor <init>(Lx7/l;)V
    .locals 0

    iput-object p1, p0, LV/k0;->D:Lx7/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LV/k0;->D:Lx7/l;

    const-wide/32 v1, 0xf4240

    div-long/2addr p1, v1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LV/k0;->a(J)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
