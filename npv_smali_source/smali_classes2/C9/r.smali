.class public final synthetic LC9/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:LE9/a;

.field public final synthetic D:LC9/v;

.field public final synthetic E:LV/G1;


# direct methods
.method public synthetic constructor <init>(LE9/a;LC9/v;LV/G1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC9/r;->C:LE9/a;

    iput-object p2, p0, LC9/r;->D:LC9/v;

    iput-object p3, p0, LC9/r;->E:LV/G1;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LC9/r;->C:LE9/a;

    iget-object v1, p0, LC9/r;->D:LC9/v;

    iget-object v2, p0, LC9/r;->E:LV/G1;

    check-cast p1, Landroidx/compose/animation/d;

    invoke-static {v0, v1, v2, p1}, LC9/p$e;->e(LE9/a;LC9/v;LV/G1;Landroidx/compose/animation/d;)Lt/k;

    move-result-object p1

    return-object p1
.end method
