.class public final enum Lh8/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh8/a$a$a;
    }
.end annotation


# static fields
.field public static final D:Lh8/a$a$a;

.field private static final E:Ljava/util/Map;

.field public static final enum F:Lh8/a$a;

.field public static final enum G:Lh8/a$a;

.field public static final enum H:Lh8/a$a;

.field public static final enum I:Lh8/a$a;

.field public static final enum J:Lh8/a$a;

.field public static final enum K:Lh8/a$a;

.field private static final synthetic L:[Lh8/a$a;

.field private static final synthetic M:Lp7/a;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    new-instance v0, Lh8/a$a;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lh8/a$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lh8/a$a;->F:Lh8/a$a;

    new-instance v0, Lh8/a$a;

    const-string v1, "CLASS"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Lh8/a$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lh8/a$a;->G:Lh8/a$a;

    new-instance v0, Lh8/a$a;

    const-string v1, "FILE_FACADE"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v3}, Lh8/a$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lh8/a$a;->H:Lh8/a$a;

    new-instance v0, Lh8/a$a;

    const-string v1, "SYNTHETIC_CLASS"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v3, v3}, Lh8/a$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lh8/a$a;->I:Lh8/a$a;

    new-instance v0, Lh8/a$a;

    const-string v1, "MULTIFILE_CLASS"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v3, v3}, Lh8/a$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lh8/a$a;->J:Lh8/a$a;

    new-instance v0, Lh8/a$a;

    const-string v1, "MULTIFILE_CLASS_PART"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v3, v3}, Lh8/a$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lh8/a$a;->K:Lh8/a$a;

    invoke-static {}, Lh8/a$a;->e()[Lh8/a$a;

    move-result-object v0

    sput-object v0, Lh8/a$a;->L:[Lh8/a$a;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lh8/a$a;->M:Lp7/a;

    new-instance v0, Lh8/a$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh8/a$a$a;-><init>(Ly7/k;)V

    sput-object v0, Lh8/a$a;->D:Lh8/a$a$a;

    invoke-static {}, Lh8/a$a;->values()[Lh8/a$a;

    move-result-object v0

    array-length v1, v0

    invoke-static {v1}, Lj7/S;->d(I)I

    move-result v1

    const/16 v3, 0x10

    invoke-static {v1, v3}, LE7/j;->d(II)I

    move-result v1

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length v1, v0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    iget v5, v4, Lh8/a$a;->C:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    sput-object v3, Lh8/a$a;->E:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lh8/a$a;->C:I

    return-void
.end method

.method private static final synthetic e()[Lh8/a$a;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lh8/a$a;

    sget-object v1, Lh8/a$a;->F:Lh8/a$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lh8/a$a;->G:Lh8/a$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lh8/a$a;->H:Lh8/a$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lh8/a$a;->I:Lh8/a$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lh8/a$a;->J:Lh8/a$a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lh8/a$a;->K:Lh8/a$a;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static final synthetic g()Ljava/util/Map;
    .locals 1

    sget-object v0, Lh8/a$a;->E:Ljava/util/Map;

    return-object v0
.end method

.method public static final i(I)Lh8/a$a;
    .locals 1

    sget-object v0, Lh8/a$a;->D:Lh8/a$a$a;

    invoke-virtual {v0, p0}, Lh8/a$a$a;->a(I)Lh8/a$a;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lh8/a$a;
    .locals 1

    const-class v0, Lh8/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh8/a$a;

    return-object p0
.end method

.method public static values()[Lh8/a$a;
    .locals 1

    sget-object v0, Lh8/a$a;->L:[Lh8/a$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh8/a$a;

    return-object v0
.end method
