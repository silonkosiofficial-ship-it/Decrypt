.class final LS5/x$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS5/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# static fields
.field static final synthetic a:[LF7/k;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ly7/I;

    const-string v1, "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    const/4 v2, 0x0

    const-class v3, LS5/x$c;

    const-string v4, "dataStore"

    invoke-direct {v0, v3, v4, v1, v2}, Ly7/I;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Ly7/P;->k(Ly7/H;)LF7/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LF7/k;

    aput-object v0, v1, v2

    sput-object v1, LS5/x$c;->a:[LF7/k;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LS5/x$c;-><init>()V

    return-void
.end method

.method public static final synthetic a(LS5/x$c;Landroid/content/Context;)LM1/h;
    .locals 0

    invoke-direct {p0, p1}, LS5/x$c;->b(Landroid/content/Context;)LM1/h;

    move-result-object p0

    return-object p0
.end method

.method private final b(Landroid/content/Context;)LM1/h;
    .locals 3

    invoke-static {}, LS5/x;->f()LB7/c;

    move-result-object v0

    sget-object v1, LS5/x$c;->a:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p1, v1}, LB7/c;->a(Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LM1/h;

    return-object p1
.end method
