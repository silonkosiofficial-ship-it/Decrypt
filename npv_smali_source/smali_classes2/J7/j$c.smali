.class final LJ7/j$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/j;-><init>(LO7/b;LJ7/e;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LJ7/j$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ7/j$c;

    invoke-direct {v0}, LJ7/j$c;-><init>()V

    sput-object v0, LJ7/j$c;->D:LJ7/j$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/e;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$this$makeKotlinParameterTypes"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lr8/h;->g(LO7/m;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/e;

    invoke-virtual {p0, p1}, LJ7/j$c;->a(LO7/e;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
