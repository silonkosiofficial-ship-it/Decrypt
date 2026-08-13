.class final LF0/d$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LF0/d$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF0/d$c;

    invoke-direct {v0}, LF0/d$c;-><init>()V

    sput-object v0, LF0/d$c;->D:LF0/d$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/c;)V
    .locals 0

    invoke-virtual {p1}, LF0/c;->Z1()V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/c;

    invoke-virtual {p0, p1}, LF0/d$c;->a(LF0/c;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
