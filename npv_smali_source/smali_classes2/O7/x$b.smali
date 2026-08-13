.class final LO7/x$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO7/x;->c(LO7/G;Ln8/b;LO7/J;)LO7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LO7/x$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LO7/x$b;

    invoke-direct {v0}, LO7/x$b;-><init>()V

    sput-object v0, LO7/x$b;->D:LO7/x$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ln8/b;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln8/b;

    invoke-virtual {p0, p1}, LO7/x$b;->a(Ln8/b;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
