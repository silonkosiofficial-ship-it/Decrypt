.class public final Li3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li3/c$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Li3/c;
    .locals 1

    invoke-static {}, Li3/c$a;->a()Li3/c;

    move-result-object v0

    return-object v0
.end method

.method public static b()Li3/a;
    .locals 1

    invoke-static {}, Li3/b;->a()Li3/a;

    move-result-object v0

    invoke-static {v0}, La3/d;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li3/a;

    return-object v0
.end method


# virtual methods
.method public c()Li3/a;
    .locals 1

    invoke-static {}, Li3/c;->b()Li3/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li3/c;->c()Li3/a;

    move-result-object v0

    return-object v0
.end method
