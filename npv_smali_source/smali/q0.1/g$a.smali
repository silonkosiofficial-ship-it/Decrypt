.class public final Lq0/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq0/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lq0/g$a;

.field private static final b:I

.field private static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq0/g$a;

    invoke-direct {v0}, Lq0/g$a;-><init>()V

    sput-object v0, Lq0/g$a;->a:Lq0/g$a;

    sget-object v0, Lo0/f0;->a:Lo0/f0$a;

    invoke-virtual {v0}, Lo0/f0$a;->B()I

    move-result v0

    sput v0, Lq0/g$a;->b:I

    sget-object v0, Lo0/z1;->a:Lo0/z1$a;

    invoke-virtual {v0}, Lo0/z1$a;->a()I

    move-result v0

    sput v0, Lq0/g$a;->c:I

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

    sget v0, Lq0/g$a;->b:I

    return v0
.end method

.method public final b()I
    .locals 1

    sget v0, Lq0/g$a;->c:I

    return v0
.end method
