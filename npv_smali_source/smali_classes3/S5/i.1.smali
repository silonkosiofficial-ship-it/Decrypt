.class public final enum LS5/i;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LB5/f;


# static fields
.field public static final enum D:LS5/i;

.field public static final enum E:LS5/i;

.field private static final synthetic F:[LS5/i;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LS5/i;

    const-string v1, "EVENT_TYPE_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LS5/i;-><init>(Ljava/lang/String;II)V

    sput-object v0, LS5/i;->D:LS5/i;

    new-instance v0, LS5/i;

    const-string v1, "SESSION_START"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, LS5/i;-><init>(Ljava/lang/String;II)V

    sput-object v0, LS5/i;->E:LS5/i;

    invoke-static {}, LS5/i;->e()[LS5/i;

    move-result-object v0

    sput-object v0, LS5/i;->F:[LS5/i;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LS5/i;->C:I

    return-void
.end method

.method private static final synthetic e()[LS5/i;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LS5/i;

    sget-object v1, LS5/i;->D:LS5/i;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LS5/i;->E:LS5/i;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LS5/i;
    .locals 1

    const-class v0, LS5/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LS5/i;

    return-object p0
.end method

.method public static values()[LS5/i;
    .locals 1

    sget-object v0, LS5/i;->F:[LS5/i;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LS5/i;

    return-object v0
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, LS5/i;->C:I

    return v0
.end method
