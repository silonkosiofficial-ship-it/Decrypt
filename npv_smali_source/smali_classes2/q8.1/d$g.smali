.class final Lq8/d$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq8/d;->J1(LF8/e0;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lq8/d$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq8/d$g;

    invoke-direct {v0}, Lq8/d$g;-><init>()V

    sput-object v0, Lq8/d$g;->D:Lq8/d$g;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF8/E;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF8/E;

    invoke-virtual {p0, p1}, Lq8/d$g;->a(LF8/E;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
