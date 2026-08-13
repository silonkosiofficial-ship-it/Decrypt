.class final LV/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/u1;


# static fields
.field public static final a:LV/x0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LV/x0;

    invoke-direct {v0}, LV/x0;-><init>()V

    sput-object v0, LV/x0;->a:LV/x0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public synthetic b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LV/t1;->a(LV/u1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NeverEqualPolicy"

    return-object v0
.end method
