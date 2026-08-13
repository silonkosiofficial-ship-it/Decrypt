.class public abstract LQ5/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ5/d$a;
    }
.end annotation


# static fields
.field public static final a:Lz5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LB5/d;

    invoke-direct {v0}, LB5/d;-><init>()V

    sget-object v1, LQ5/a;->a:LA5/a;

    invoke-virtual {v0, v1}, LB5/d;->j(LA5/a;)LB5/d;

    move-result-object v0

    invoke-virtual {v0}, LB5/d;->i()Lz5/a;

    move-result-object v0

    sput-object v0, LQ5/d;->a:Lz5/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LQ5/d$a;
    .locals 1

    new-instance v0, LQ5/b$b;

    invoke-direct {v0}, LQ5/b$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()J
.end method

.method public abstract f()Ljava/lang/String;
.end method
