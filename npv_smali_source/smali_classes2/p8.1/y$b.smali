.class public enum Lp8/y$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp8/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = "b"
.end annotation


# static fields
.field public static final enum E:Lp8/y$b;

.field public static final enum F:Lp8/y$b;

.field public static final enum G:Lp8/y$b;

.field public static final enum H:Lp8/y$b;

.field public static final enum I:Lp8/y$b;

.field public static final enum J:Lp8/y$b;

.field public static final enum K:Lp8/y$b;

.field public static final enum L:Lp8/y$b;

.field public static final enum M:Lp8/y$b;

.field public static final enum N:Lp8/y$b;

.field public static final enum O:Lp8/y$b;

.field public static final enum P:Lp8/y$b;

.field public static final enum Q:Lp8/y$b;

.field public static final enum R:Lp8/y$b;

.field public static final enum S:Lp8/y$b;

.field public static final enum T:Lp8/y$b;

.field public static final enum U:Lp8/y$b;

.field public static final enum V:Lp8/y$b;

.field private static final synthetic W:[Lp8/y$b;


# instance fields
.field private final C:Lp8/y$c;

.field private final D:I


# direct methods
.method static constructor <clinit>()V
    .locals 22

    new-instance v0, Lp8/y$b;

    sget-object v1, Lp8/y$c;->G:Lp8/y$c;

    const-string v2, "DOUBLE"

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v1, v4}, Lp8/y$b;-><init>(Ljava/lang/String;ILp8/y$c;I)V

    sput-object v0, Lp8/y$b;->E:Lp8/y$b;

    new-instance v1, Lp8/y$b;

    sget-object v2, Lp8/y$c;->F:Lp8/y$c;

    const-string v5, "FLOAT"

    const/4 v6, 0x5

    invoke-direct {v1, v5, v4, v2, v6}, Lp8/y$b;-><init>(Ljava/lang/String;ILp8/y$c;I)V

    sput-object v1, Lp8/y$b;->F:Lp8/y$b;

    new-instance v2, Lp8/y$b;

    sget-object v5, Lp8/y$c;->E:Lp8/y$c;

    const-string v7, "INT64"

    const/4 v8, 0x2

    invoke-direct {v2, v7, v8, v5, v3}, Lp8/y$b;-><init>(Ljava/lang/String;ILp8/y$c;I)V

    sput-object v2, Lp8/y$b;->G:Lp8/y$b;

    new-instance v7, Lp8/y$b;

    const-string v9, "UINT64"

    const/4 v10, 0x3

    invoke-direct {v7, v9, v10, v5, v3}, Lp8/y$b;-><init>(Ljava/lang/String;ILp8/y$c;I)V

    sput-object v7, Lp8/y$b;->H:Lp8/y$b;

    new-instance v9, Lp8/y$b;

    sget-object v11, Lp8/y$c;->D:Lp8/y$c;

    const-string v12, "INT32"

    const/4 v13, 0x4

    invoke-direct {v9, v12, v13, v11, v3}, Lp8/y$b;-><init>(Ljava/lang/String;ILp8/y$c;I)V

    sput-object v9, Lp8/y$b;->I:Lp8/y$b;

    new-instance v12, Lp8/y$b;

    const-string v14, "FIXED64"

    invoke-direct {v12, v14, v6, v5, v4}, Lp8/y$b;-><init>(Ljava/lang/String;ILp8/y$c;I)V

    sput-object v12, Lp8/y$b;->J:Lp8/y$b;

    new-instance v14, Lp8/y$b;

    const-string v15, "FIXED32"

    const/4 v13, 0x6

    invoke-direct {v14, v15, v13, v11, v6}, Lp8/y$b;-><init>(Ljava/lang/String;ILp8/y$c;I)V

    sput-object v14, Lp8/y$b;->K:Lp8/y$b;

    new-instance v15, Lp8/y$b;

    const/4 v13, 0x7

    sget-object v4, Lp8/y$c;->H:Lp8/y$c;

    const-string v6, "BOOL"

    invoke-direct {v15, v6, v13, v4, v3}, Lp8/y$b;-><init>(Ljava/lang/String;ILp8/y$c;I)V

    sput-object v15, Lp8/y$b;->L:Lp8/y$b;

    new-instance v4, Lp8/y$b$a;

    const/16 v6, 0x8

    sget-object v13, Lp8/y$c;->I:Lp8/y$c;

    const-string v3, "STRING"

    invoke-direct {v4, v3, v6, v13, v8}, Lp8/y$b$a;-><init>(Ljava/lang/String;ILp8/y$c;I)V

    sput-object v4, Lp8/y$b;->M:Lp8/y$b;

    new-instance v3, Lp8/y$b$b;

    sget-object v13, Lp8/y$c;->L:Lp8/y$c;

    const-string v6, "GROUP"

    const/16 v8, 0x9

    invoke-direct {v3, v6, v8, v13, v10}, Lp8/y$b$b;-><init>(Ljava/lang/String;ILp8/y$c;I)V

    sput-object v3, Lp8/y$b;->N:Lp8/y$b;

    new-instance v6, Lp8/y$b$c;

    const-string v8, "MESSAGE"

    const/16 v10, 0xa

    move-object/from16 v16, v3

    const/4 v3, 0x2

    invoke-direct {v6, v8, v10, v13, v3}, Lp8/y$b$c;-><init>(Ljava/lang/String;ILp8/y$c;I)V

    sput-object v6, Lp8/y$b;->O:Lp8/y$b;

    new-instance v8, Lp8/y$b$d;

    const/16 v13, 0xb

    sget-object v10, Lp8/y$c;->J:Lp8/y$c;

    move-object/from16 v17, v6

    const-string v6, "BYTES"

    invoke-direct {v8, v6, v13, v10, v3}, Lp8/y$b$d;-><init>(Ljava/lang/String;ILp8/y$c;I)V

    sput-object v8, Lp8/y$b;->P:Lp8/y$b;

    new-instance v3, Lp8/y$b;

    const-string v6, "UINT32"

    const/16 v10, 0xc

    const/4 v13, 0x0

    invoke-direct {v3, v6, v10, v11, v13}, Lp8/y$b;-><init>(Ljava/lang/String;ILp8/y$c;I)V

    sput-object v3, Lp8/y$b;->Q:Lp8/y$b;

    new-instance v6, Lp8/y$b;

    const/16 v10, 0xd

    move-object/from16 v18, v3

    sget-object v3, Lp8/y$c;->K:Lp8/y$c;

    move-object/from16 v19, v8

    const-string v8, "ENUM"

    invoke-direct {v6, v8, v10, v3, v13}, Lp8/y$b;-><init>(Ljava/lang/String;ILp8/y$c;I)V

    sput-object v6, Lp8/y$b;->R:Lp8/y$b;

    new-instance v3, Lp8/y$b;

    const-string v8, "SFIXED32"

    const/16 v13, 0xe

    const/4 v10, 0x5

    invoke-direct {v3, v8, v13, v11, v10}, Lp8/y$b;-><init>(Ljava/lang/String;ILp8/y$c;I)V

    sput-object v3, Lp8/y$b;->S:Lp8/y$b;

    new-instance v8, Lp8/y$b;

    const-string v10, "SFIXED64"

    const/16 v13, 0xf

    move-object/from16 v20, v3

    const/4 v3, 0x1

    invoke-direct {v8, v10, v13, v5, v3}, Lp8/y$b;-><init>(Ljava/lang/String;ILp8/y$c;I)V

    sput-object v8, Lp8/y$b;->T:Lp8/y$b;

    new-instance v3, Lp8/y$b;

    const-string v10, "SINT32"

    const/16 v13, 0x10

    move-object/from16 v21, v8

    const/4 v8, 0x0

    invoke-direct {v3, v10, v13, v11, v8}, Lp8/y$b;-><init>(Ljava/lang/String;ILp8/y$c;I)V

    sput-object v3, Lp8/y$b;->U:Lp8/y$b;

    new-instance v10, Lp8/y$b;

    const-string v11, "SINT64"

    const/16 v13, 0x11

    invoke-direct {v10, v11, v13, v5, v8}, Lp8/y$b;-><init>(Ljava/lang/String;ILp8/y$c;I)V

    sput-object v10, Lp8/y$b;->V:Lp8/y$b;

    const/16 v5, 0x12

    new-array v5, v5, [Lp8/y$b;

    aput-object v0, v5, v8

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v0, 0x2

    aput-object v2, v5, v0

    const/4 v0, 0x3

    aput-object v7, v5, v0

    const/4 v0, 0x4

    aput-object v9, v5, v0

    const/4 v0, 0x5

    aput-object v12, v5, v0

    const/4 v0, 0x6

    aput-object v14, v5, v0

    const/4 v0, 0x7

    aput-object v15, v5, v0

    const/16 v0, 0x8

    aput-object v4, v5, v0

    const/16 v0, 0x9

    aput-object v16, v5, v0

    const/16 v0, 0xa

    aput-object v17, v5, v0

    const/16 v0, 0xb

    aput-object v19, v5, v0

    const/16 v0, 0xc

    aput-object v18, v5, v0

    const/16 v0, 0xd

    aput-object v6, v5, v0

    const/16 v0, 0xe

    aput-object v20, v5, v0

    const/16 v0, 0xf

    aput-object v21, v5, v0

    const/16 v0, 0x10

    aput-object v3, v5, v0

    aput-object v10, v5, v13

    sput-object v5, Lp8/y$b;->W:[Lp8/y$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILp8/y$c;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lp8/y$b;->C:Lp8/y$c;

    iput p4, p0, Lp8/y$b;->D:I

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILp8/y$c;ILp8/y$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lp8/y$b;-><init>(Ljava/lang/String;ILp8/y$c;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lp8/y$b;
    .locals 1

    const-class v0, Lp8/y$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lp8/y$b;

    return-object p0
.end method

.method public static values()[Lp8/y$b;
    .locals 1

    sget-object v0, Lp8/y$b;->W:[Lp8/y$b;

    invoke-virtual {v0}, [Lp8/y$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp8/y$b;

    return-object v0
.end method


# virtual methods
.method public e()Lp8/y$c;
    .locals 1

    iget-object v0, p0, Lp8/y$b;->C:Lp8/y$c;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lp8/y$b;->D:I

    return v0
.end method

.method public i()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
