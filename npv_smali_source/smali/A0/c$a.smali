.class public final enum LA0/c$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum C:LA0/c$a;

.field public static final enum D:LA0/c$a;

.field private static final synthetic E:[LA0/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LA0/c$a;

    const-string v1, "Lsq2"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LA0/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA0/c$a;->C:LA0/c$a;

    new-instance v0, LA0/c$a;

    const-string v1, "Impulse"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LA0/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA0/c$a;->D:LA0/c$a;

    invoke-static {}, LA0/c$a;->e()[LA0/c$a;

    move-result-object v0

    sput-object v0, LA0/c$a;->E:[LA0/c$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LA0/c$a;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LA0/c$a;

    sget-object v1, LA0/c$a;->C:LA0/c$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LA0/c$a;->D:LA0/c$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LA0/c$a;
    .locals 1

    const-class v0, LA0/c$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LA0/c$a;

    return-object p0
.end method

.method public static values()[LA0/c$a;
    .locals 1

    sget-object v0, LA0/c$a;->E:[LA0/c$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LA0/c$a;

    return-object v0
.end method
