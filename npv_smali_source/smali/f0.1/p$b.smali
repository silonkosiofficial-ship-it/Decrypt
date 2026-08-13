.class final Lf0/p$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf0/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lf0/p$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf0/p$b;

    invoke-direct {v0}, Lf0/p$b;-><init>()V

    sput-object v0, Lf0/p$b;->D:Lf0/p$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lf0/n;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf0/n;

    invoke-virtual {p0, p1}, Lf0/p$b;->a(Lf0/n;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
