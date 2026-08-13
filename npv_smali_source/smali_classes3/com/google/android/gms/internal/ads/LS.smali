.class public final Lcom/google/android/gms/internal/ads/LS;
.super Lcom/google/android/gms/internal/ads/MS;
.source "SourceFile"


# static fields
.field private static final h:Landroid/util/SparseArray;


# instance fields
.field private final c:Landroid/content/Context;

.field private final d:Lcom/google/android/gms/internal/ads/gC;

.field private final e:Landroid/telephony/TelephonyManager;

.field private final f:Lcom/google/android/gms/internal/ads/DS;

.field private g:Lcom/google/android/gms/internal/ads/Ve;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/LS;->h:Landroid/util/SparseArray;

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->CONNECTED:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    sget-object v2, Lcom/google/android/gms/internal/ads/Kd;->F:Lcom/google/android/gms/internal/ads/Kd;

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->AUTHENTICATING:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    sget-object v2, Lcom/google/android/gms/internal/ads/Kd;->E:Lcom/google/android/gms/internal/ads/Kd;

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->CONNECTING:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->OBTAINING_IPADDR:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->DISCONNECTING:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    sget-object v3, Lcom/google/android/gms/internal/ads/Kd;->G:Lcom/google/android/gms/internal/ads/Kd;

    invoke-virtual {v0, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->BLOCKED:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    sget-object v3, Lcom/google/android/gms/internal/ads/Kd;->H:Lcom/google/android/gms/internal/ads/Kd;

    invoke-virtual {v0, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->DISCONNECTED:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->FAILED:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->IDLE:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->SCANNING:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->SUSPENDED:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    sget-object v3, Lcom/google/android/gms/internal/ads/Kd;->I:Lcom/google/android/gms/internal/ads/Kd;

    invoke-virtual {v0, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->CAPTIVE_PORTAL_CHECK:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->VERIFYING_POOR_LINK:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/gC;Lcom/google/android/gms/internal/ads/DS;Lcom/google/android/gms/internal/ads/zS;Lv3/s0;)V
    .locals 0

    invoke-direct {p0, p4, p5}, Lcom/google/android/gms/internal/ads/MS;-><init>(Lcom/google/android/gms/internal/ads/zS;Lv3/s0;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/LS;->c:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/LS;->d:Lcom/google/android/gms/internal/ads/gC;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/LS;->f:Lcom/google/android/gms/internal/ads/DS;

    const-string p2, "phone"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/telephony/TelephonyManager;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/LS;->e:Landroid/telephony/TelephonyManager;

    return-void
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/ads/LS;Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/Ed;
    .locals 4

    .prologue
    invoke-static {}, Lcom/google/android/gms/internal/ads/Ed;->d0()Lcom/google/android/gms/internal/ads/zd;

    move-result-object v0

    const/4 v1, -0x2

    const-string v2, "cnt"

    invoke-virtual {p1, v2, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x0

    const-string v3, "gnt"

    invoke-virtual {p1, v3, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/ads/Ve;->E:Lcom/google/android/gms/internal/ads/Ve;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/LS;->g:Lcom/google/android/gms/internal/ads/Ve;

    goto :goto_3

    :cond_0
    sget-object v2, Lcom/google/android/gms/internal/ads/Ve;->D:Lcom/google/android/gms/internal/ads/Ve;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/LS;->g:Lcom/google/android/gms/internal/ads/Ve;

    if-eqz v1, :cond_2

    const/4 p0, 0x1

    if-eq v1, p0, :cond_1

    sget-object p0, Lcom/google/android/gms/internal/ads/Cd;->D:Lcom/google/android/gms/internal/ads/Cd;

    :goto_0
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zd;->A(Lcom/google/android/gms/internal/ads/Cd;)Lcom/google/android/gms/internal/ads/zd;

    goto :goto_1

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/ads/Cd;->F:Lcom/google/android/gms/internal/ads/Cd;

    goto :goto_0

    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/ads/Cd;->E:Lcom/google/android/gms/internal/ads/Cd;

    goto :goto_0

    :goto_1
    packed-switch p1, :pswitch_data_0

    sget-object p0, Lcom/google/android/gms/internal/ads/Ad;->D:Lcom/google/android/gms/internal/ads/Ad;

    goto :goto_2

    :pswitch_0
    sget-object p0, Lcom/google/android/gms/internal/ads/Ad;->G:Lcom/google/android/gms/internal/ads/Ad;

    goto :goto_2

    :pswitch_1
    sget-object p0, Lcom/google/android/gms/internal/ads/Ad;->F:Lcom/google/android/gms/internal/ads/Ad;

    goto :goto_2

    :pswitch_2
    sget-object p0, Lcom/google/android/gms/internal/ads/Ad;->E:Lcom/google/android/gms/internal/ads/Ad;

    :goto_2
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zd;->z(Lcom/google/android/gms/internal/ads/Ad;)Lcom/google/android/gms/internal/ads/zd;

    :goto_3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/Ed;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/LS;Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/Kd;
    .locals 1

    const-string p0, "device"

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/B70;->a(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    const-string p1, "network"

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/B70;->a(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    const-string p1, "active_network_state"

    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    sget-object p1, Lcom/google/android/gms/internal/ads/LS;->h:Landroid/util/SparseArray;

    sget-object v0, Lcom/google/android/gms/internal/ads/Kd;->D:Lcom/google/android/gms/internal/ads/Kd;

    invoke-virtual {p1, p0, v0}, Landroid/util/SparseArray;->get(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/Kd;

    return-object p0
.end method

.method static bridge synthetic d(Lcom/google/android/gms/internal/ads/LS;)Lcom/google/android/gms/internal/ads/DS;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/LS;->f:Lcom/google/android/gms/internal/ads/DS;

    return-object p0
.end method

.method static bridge synthetic f(Lcom/google/android/gms/internal/ads/LS;ZLjava/util/ArrayList;Lcom/google/android/gms/internal/ads/Ed;Lcom/google/android/gms/internal/ads/Kd;)[B
    .locals 5

    .prologue
    invoke-static {}, Lcom/google/android/gms/internal/ads/Hd;->E0()Lcom/google/android/gms/internal/ads/Id;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/Id;->M(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/Id;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/LS;->c:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p2

    const-string v1, "airplane_mode_on"

    const/4 v2, 0x0

    invoke-static {p2, v1, v2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p2

    const/4 v1, 0x1

    if-eqz p2, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    move p2, v2

    :goto_0
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/LS;->g(Z)Lcom/google/android/gms/internal/ads/Ve;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/Id;->z(Lcom/google/android/gms/internal/ads/Ve;)Lcom/google/android/gms/internal/ads/Id;

    invoke-static {}, Lr3/v;->u()Lv3/b;

    move-result-object p2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/LS;->c:Landroid/content/Context;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/LS;->e:Landroid/telephony/TelephonyManager;

    invoke-virtual {p2, v3, v4}, Lv3/b;->f(Landroid/content/Context;Landroid/telephony/TelephonyManager;)Lcom/google/android/gms/internal/ads/Ve;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/Id;->A(Lcom/google/android/gms/internal/ads/Ve;)Lcom/google/android/gms/internal/ads/Id;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/LS;->f:Lcom/google/android/gms/internal/ads/DS;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/DS;->e()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/ads/Id;->H(J)Lcom/google/android/gms/internal/ads/Id;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/LS;->f:Lcom/google/android/gms/internal/ads/DS;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/DS;->b()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/ads/Id;->G(J)Lcom/google/android/gms/internal/ads/Id;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/LS;->f:Lcom/google/android/gms/internal/ads/DS;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/DS;->a()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/Id;->B(I)Lcom/google/android/gms/internal/ads/Id;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/ads/Id;->C(Lcom/google/android/gms/internal/ads/Kd;)Lcom/google/android/gms/internal/ads/Id;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ads/Id;->E(Lcom/google/android/gms/internal/ads/Ed;)Lcom/google/android/gms/internal/ads/Id;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/LS;->g:Lcom/google/android/gms/internal/ads/Ve;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/Id;->F(Lcom/google/android/gms/internal/ads/Ve;)Lcom/google/android/gms/internal/ads/Id;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/LS;->g(Z)Lcom/google/android/gms/internal/ads/Ve;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Id;->I(Lcom/google/android/gms/internal/ads/Ve;)Lcom/google/android/gms/internal/ads/Id;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/LS;->f:Lcom/google/android/gms/internal/ads/DS;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/DS;->d()J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Id;->K(J)Lcom/google/android/gms/internal/ads/Id;

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object p1

    invoke-interface {p1}, LV3/f;->a()J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Id;->J(J)Lcom/google/android/gms/internal/ads/Id;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/LS;->c:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string p1, "wifi_on"

    invoke-static {p0, p1, v2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p0

    if-eqz p0, :cond_1

    move v2, v1

    :cond_1
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/LS;->g(Z)Lcom/google/android/gms/internal/ads/Ve;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/Id;->L(Lcom/google/android/gms/internal/ads/Ve;)Lcom/google/android/gms/internal/ads/Id;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/Hd;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Ou0;->l()[B

    move-result-object p0

    return-object p0
.end method

.method private static final g(Z)Lcom/google/android/gms/internal/ads/Ve;
    .locals 0

    .prologue
    if-eqz p0, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/ads/Ve;->E:Lcom/google/android/gms/internal/ads/Ve;

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/ads/Ve;->D:Lcom/google/android/gms/internal/ads/Ve;

    :goto_0
    return-object p0
.end method


# virtual methods
.method public final e(Z)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/LS;->d:Lcom/google/android/gms/internal/ads/gC;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/gC;->b(Landroid/os/Bundle;)LP4/d;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/KS;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/KS;-><init>(Lcom/google/android/gms/internal/ads/LS;Z)V

    sget-object p1, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-void
.end method
