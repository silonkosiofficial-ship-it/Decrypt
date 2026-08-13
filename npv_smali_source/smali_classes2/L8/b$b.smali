.class final LL8/b$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL8/b;->c(LF8/i0;Z)LF8/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LL8/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL8/b$b;

    invoke-direct {v0}, LL8/b$b;-><init>()V

    sput-object v0, LL8/b$b;->D:LL8/b$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF8/t0;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p1}, Ls8/d;->d(LF8/E;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF8/t0;

    invoke-virtual {p0, p1}, LL8/b$b;->a(LF8/t0;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
