.class public final enum Lu7/a$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum C:Lu7/a$b;

.field public static final enum D:Lu7/a$b;

.field public static final enum E:Lu7/a$b;

.field public static final enum F:Lu7/a$b;

.field private static final synthetic G:[Lu7/a$b;

.field private static final synthetic H:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lu7/a$b;

    const-string v1, "PRESENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lu7/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lu7/a$b;->C:Lu7/a$b;

    new-instance v0, Lu7/a$b;

    const-string v1, "ABSENT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lu7/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lu7/a$b;->D:Lu7/a$b;

    new-instance v0, Lu7/a$b;

    const-string v1, "PRESENT_OPTIONAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lu7/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lu7/a$b;->E:Lu7/a$b;

    new-instance v0, Lu7/a$b;

    const-string v1, "ABSENT_OPTIONAL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lu7/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lu7/a$b;->F:Lu7/a$b;

    invoke-static {}, Lu7/a$b;->e()[Lu7/a$b;

    move-result-object v0

    sput-object v0, Lu7/a$b;->G:[Lu7/a$b;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lu7/a$b;->H:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lu7/a$b;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lu7/a$b;

    sget-object v1, Lu7/a$b;->C:Lu7/a$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lu7/a$b;->D:Lu7/a$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lu7/a$b;->E:Lu7/a$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lu7/a$b;->F:Lu7/a$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lu7/a$b;
    .locals 1

    const-class v0, Lu7/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lu7/a$b;

    return-object p0
.end method

.method public static values()[Lu7/a$b;
    .locals 1

    sget-object v0, Lu7/a$b;->G:[Lu7/a$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lu7/a$b;

    return-object v0
.end method
