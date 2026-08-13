.class final LC9/p$e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC9/p$e;->m(LA/g;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:Le0/d;


# direct methods
.method constructor <init>(Le0/d;)V
    .locals 0

    iput-object p1, p0, LC9/p$e$c;->C:Le0/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lt/b;LC9/g;LV/n;I)V
    .locals 3

    .prologue
    const-string v0, "$this$AnimatedContent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entry"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "moe.tlaster.precompose.navigation.NavHost.<anonymous>.<anonymous>.<anonymous> (NavHost.kt:260)"

    const v2, 0x7bb122f0

    invoke-static {v2, p4, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v0, p0, LC9/p$e$c;->C:Le0/d;

    and-int/lit8 v1, p4, 0xe

    shl-int/lit8 p4, p4, 0x3

    and-int/lit16 p4, p4, 0x380

    or-int/2addr p4, v1

    invoke-static {p1, v0, p2, p3, p4}, LC9/p;->D(Lt/b;Le0/d;LC9/g;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-void
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lt/b;

    check-cast p2, LC9/g;

    check-cast p3, LV/n;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LC9/p$e$c;->a(Lt/b;LC9/g;LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
