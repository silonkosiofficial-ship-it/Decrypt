.class final enum Lg8/b$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "c"
.end annotation


# static fields
.field public static final enum C:Lg8/b$c;

.field public static final enum D:Lg8/b$c;

.field public static final enum E:Lg8/b$c;

.field private static final synthetic F:[Lg8/b$c;

.field private static final synthetic G:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg8/b$c;

    const-string v1, "PROPERTY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg8/b$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg8/b$c;->C:Lg8/b$c;

    new-instance v0, Lg8/b$c;

    const-string v1, "BACKING_FIELD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lg8/b$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg8/b$c;->D:Lg8/b$c;

    new-instance v0, Lg8/b$c;

    const-string v1, "DELEGATE_FIELD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lg8/b$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg8/b$c;->E:Lg8/b$c;

    invoke-static {}, Lg8/b$c;->e()[Lg8/b$c;

    move-result-object v0

    sput-object v0, Lg8/b$c;->F:[Lg8/b$c;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lg8/b$c;->G:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lg8/b$c;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lg8/b$c;

    sget-object v1, Lg8/b$c;->C:Lg8/b$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lg8/b$c;->D:Lg8/b$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lg8/b$c;->E:Lg8/b$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lg8/b$c;
    .locals 1

    const-class v0, Lg8/b$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg8/b$c;

    return-object p0
.end method

.method public static values()[Lg8/b$c;
    .locals 1

    sget-object v0, Lg8/b$c;->F:[Lg8/b$c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg8/b$c;

    return-object v0
.end method
