.class public interface abstract LO3/a$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO3/a$d$a;
    }
.end annotation


# static fields
.field public static final c:LO3/a$d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LO3/a$d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LO3/a$d$a;-><init>(LO3/m;)V

    sput-object v0, LO3/a$d;->c:LO3/a$d$a;

    return-void
.end method
