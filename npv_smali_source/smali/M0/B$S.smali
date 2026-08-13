.class final LM0/B$S;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM0/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LM0/B$S;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/B$S;

    invoke-direct {v0}, LM0/B$S;-><init>()V

    sput-object v0, LM0/B$S;->D:LM0/B$S;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)LM0/U;
    .locals 1

    .prologue
    new-instance v0, LM0/U;

    if-eqz p1, :cond_0

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {v0, p1}, LM0/U;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LM0/B$S;->a(Ljava/lang/Object;)LM0/U;

    move-result-object p1

    return-object p1
.end method
