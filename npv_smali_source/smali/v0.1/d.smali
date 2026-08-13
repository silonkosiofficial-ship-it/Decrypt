.class public final Lv0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lv0/d;

.field private static final b:I

.field private static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv0/d;

    invoke-direct {v0}, Lv0/d;-><init>()V

    sput-object v0, Lv0/d;->a:Lv0/d;

    const/4 v0, 0x0

    invoke-static {v0}, Lv0/b;->a(I)I

    move-result v0

    sput v0, Lv0/d;->b:I

    const/16 v0, 0x9

    invoke-static {v0}, Lv0/b;->a(I)I

    move-result v0

    sput v0, Lv0/d;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    sget v0, Lv0/d;->b:I

    return v0
.end method

.method public final b()I
    .locals 1

    sget v0, Lv0/d;->c:I

    return v0
.end method
