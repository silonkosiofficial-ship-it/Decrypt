.class public final LL7/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LL7/a$a;

.field private static final b:Li7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LL7/a$a;

    invoke-direct {v0}, LL7/a$a;-><init>()V

    sput-object v0, LL7/a$a;->a:LL7/a$a;

    sget-object v0, Li7/r;->D:Li7/r;

    sget-object v1, LL7/a$a$a;->D:LL7/a$a$a;

    invoke-static {v0, v1}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, LL7/a$a;->b:Li7/n;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LL7/a;
    .locals 1

    sget-object v0, LL7/a$a;->b:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LL7/a;

    return-object v0
.end method
