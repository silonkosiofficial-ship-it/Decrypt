.class final synthetic Lv2/c$a$e;
.super Ly7/G;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv2/c$a;->a1()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final K:Lv2/c$a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv2/c$a$e;

    invoke-direct {v0}, Lv2/c$a$e;-><init>()V

    sput-object v0, Lv2/c$a$e;->K:Lv2/c$a$e;

    return-void
.end method

.method constructor <init>()V
    .locals 4

    const-string v0, "isWriteAheadLoggingEnabled()Z"

    const/4 v1, 0x0

    const-class v2, Lz2/d;

    const-string v3, "isWriteAheadLoggingEnabled"

    invoke-direct {p0, v2, v3, v0, v1}, Ly7/G;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz2/d;

    invoke-interface {p1}, Lz2/d;->a1()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
