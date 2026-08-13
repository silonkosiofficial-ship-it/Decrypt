.class final synthetic Lv2/c$a$a;
.super Ly7/G;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv2/c$a;->z()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final K:Lv2/c$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv2/c$a$a;

    invoke-direct {v0}, Lv2/c$a$a;-><init>()V

    sput-object v0, Lv2/c$a$a;->K:Lv2/c$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 4

    const-string v0, "getAttachedDbs()Ljava/util/List;"

    const/4 v1, 0x0

    const-class v2, Lz2/d;

    const-string v3, "attachedDbs"

    invoke-direct {p0, v2, v3, v0, v1}, Ly7/G;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz2/d;

    invoke-interface {p1}, Lz2/d;->z()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
