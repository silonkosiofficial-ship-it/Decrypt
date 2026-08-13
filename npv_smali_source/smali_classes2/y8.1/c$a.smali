.class public final Ly8/c$a;
.super Ly8/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Ly8/c$a;

.field private static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ly8/c$a;

    invoke-direct {v0}, Ly8/c$a;-><init>()V

    sput-object v0, Ly8/c$a;->a:Ly8/c$a;

    sget-object v0, Ly8/d;->c:Ly8/d$a;

    invoke-virtual {v0}, Ly8/d$a;->b()I

    move-result v1

    invoke-virtual {v0}, Ly8/d$a;->d()I

    move-result v2

    invoke-virtual {v0}, Ly8/d$a;->i()I

    move-result v0

    or-int/2addr v0, v2

    not-int v0, v0

    and-int/2addr v0, v1

    sput v0, Ly8/c$a;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ly8/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    sget v0, Ly8/c$a;->b:I

    return v0
.end method
