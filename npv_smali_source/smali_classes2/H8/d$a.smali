.class final LH8/d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LH8/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH8/d$a;

    invoke-direct {v0}, LH8/d$a;-><init>()V

    sput-object v0, LH8/d$a;->D:LH8/d$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LL7/e;
    .locals 1

    sget-object v0, LL7/e;->h:LL7/e$b;

    invoke-virtual {v0}, LL7/e$b;->a()LL7/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LH8/d$a;->a()LL7/e;

    move-result-object v0

    return-object v0
.end method
