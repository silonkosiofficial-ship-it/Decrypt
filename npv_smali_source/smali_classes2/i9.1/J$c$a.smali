.class final synthetic Li9/J$c$a;
.super Ly7/A;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li9/J$c;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final K:Li9/J$c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li9/J$c$a;

    invoke-direct {v0}, Li9/J$c$a;-><init>()V

    sput-object v0, Li9/J$c$a;->K:Li9/J$c$a;

    return-void
.end method

.method constructor <init>()V
    .locals 4

    const-string v0, "isNegative()Ljava/lang/Boolean;"

    const/4 v1, 0x0

    const-class v2, Li9/V;

    const-string v3, "isNegative"

    invoke-direct {p0, v2, v3, v0, v1}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li9/V;

    invoke-interface {p1}, Li9/V;->c()Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public r(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Li9/V;

    check-cast p2, Ljava/lang/Boolean;

    invoke-interface {p1, p2}, Li9/V;->z(Ljava/lang/Boolean;)V

    return-void
.end method
