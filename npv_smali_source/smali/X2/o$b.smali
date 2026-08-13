.class public final enum LX2/o$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum D:LX2/o$b;

.field public static final enum E:LX2/o$b;

.field private static final synthetic F:[LX2/o$b;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LX2/o$b;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LX2/o$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LX2/o$b;->D:LX2/o$b;

    new-instance v1, LX2/o$b;

    const/4 v3, 0x1

    const/16 v4, 0x17

    const-string v5, "ANDROID_FIREBASE"

    invoke-direct {v1, v5, v3, v4}, LX2/o$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, LX2/o$b;->E:LX2/o$b;

    const/4 v4, 0x2

    new-array v4, v4, [LX2/o$b;

    aput-object v0, v4, v2

    aput-object v1, v4, v3

    sput-object v4, LX2/o$b;->F:[LX2/o$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LX2/o$b;->C:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LX2/o$b;
    .locals 1

    const-class v0, LX2/o$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LX2/o$b;

    return-object p0
.end method

.method public static values()[LX2/o$b;
    .locals 1

    sget-object v0, LX2/o$b;->F:[LX2/o$b;

    invoke-virtual {v0}, [LX2/o$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LX2/o$b;

    return-object v0
.end method
