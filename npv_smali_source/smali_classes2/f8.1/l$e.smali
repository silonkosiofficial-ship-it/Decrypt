.class final Lf8/l$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf8/l;->i(LO7/f0;Ljava/util/List;La8/g;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lf8/l$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf8/l$e;

    invoke-direct {v0}, Lf8/l$e;-><init>()V

    sput-object v0, Lf8/l$e;->D:Lf8/l$e;

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
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, LF8/L;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF8/t0;

    invoke-virtual {p0, p1}, Lf8/l$e;->a(LF8/t0;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
