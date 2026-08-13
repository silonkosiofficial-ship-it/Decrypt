.class public final LP7/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LP7/g$a;

.field private static final b:LP7/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP7/g$a;

    invoke-direct {v0}, LP7/g$a;-><init>()V

    sput-object v0, LP7/g$a;->a:LP7/g$a;

    new-instance v0, LP7/g$a$a;

    invoke-direct {v0}, LP7/g$a$a;-><init>()V

    sput-object v0, LP7/g$a;->b:LP7/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)LP7/g;
    .locals 1

    .prologue
    const-string v0, "annotations"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LP7/g$a;->b:LP7/g;

    goto :goto_0

    :cond_0
    new-instance v0, LP7/h;

    invoke-direct {v0, p1}, LP7/h;-><init>(Ljava/util/List;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final b()LP7/g;
    .locals 1

    sget-object v0, LP7/g$a;->b:LP7/g;

    return-object v0
.end method
