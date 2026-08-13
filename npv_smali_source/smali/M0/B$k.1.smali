.class final LM0/B$k;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM0/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LM0/B$k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/B$k;

    invoke-direct {v0}, LM0/B$k;-><init>()V

    sput-object v0, LM0/B$k;->D:LM0/B$k;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le0/l;J)Ljava/lang/Object;
    .locals 2

    .prologue
    const-wide/16 v0, 0x10

    cmp-long p1, p2, v0

    if-nez p1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    invoke-static {p2, p3}, Lo0/A0;->k(J)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Le0/l;

    check-cast p2, Lo0/y0;

    invoke-virtual {p2}, Lo0/y0;->w()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LM0/B$k;->a(Le0/l;J)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
