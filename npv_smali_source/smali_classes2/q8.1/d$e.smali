.class final Lq8/d$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq8/d;->b1(LO7/l;Ljava/lang/StringBuilder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lq8/d$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq8/d$e;

    invoke-direct {v0}, Lq8/d$e;-><init>()V

    sput-object v0, Lq8/d$e;->D:Lq8/d$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/j0;)Ljava/lang/CharSequence;
    .locals 0

    const-string p1, ""

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/j0;

    invoke-virtual {p0, p1}, Lq8/d$e;->a(LO7/j0;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
