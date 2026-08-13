.class public final LT7/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT7/k$a;
    }
.end annotation


# static fields
.field public static final c:LT7/k$a;


# instance fields
.field private final a:LB8/k;

.field private final b:LT7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LT7/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT7/k$a;-><init>(Ly7/k;)V

    sput-object v0, LT7/k;->c:LT7/k$a;

    return-void
.end method

.method private constructor <init>(LB8/k;LT7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT7/k;->a:LB8/k;

    iput-object p2, p0, LT7/k;->b:LT7/a;

    return-void
.end method

.method public synthetic constructor <init>(LB8/k;LT7/a;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LT7/k;-><init>(LB8/k;LT7/a;)V

    return-void
.end method


# virtual methods
.method public final a()LB8/k;
    .locals 1

    iget-object v0, p0, LT7/k;->a:LB8/k;

    return-object v0
.end method

.method public final b()LO7/G;
    .locals 1

    iget-object v0, p0, LT7/k;->a:LB8/k;

    invoke-virtual {v0}, LB8/k;->q()LO7/G;

    move-result-object v0

    return-object v0
.end method

.method public final c()LT7/a;
    .locals 1

    iget-object v0, p0, LT7/k;->b:LT7/a;

    return-object v0
.end method
